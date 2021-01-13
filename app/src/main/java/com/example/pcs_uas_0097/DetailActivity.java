package com.example.pcs_uas_0097;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pcs_uas_0097.api.ApiClient;
import com.example.pcs_uas_0097.api.ApiService;
import com.example.pcs_uas_0097.helper.DataHelper;
import com.example.pcs_uas_0097.model.EventsItem;
import com.example.pcs_uas_0097.model.TeamResponse;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    ApiService service = ApiClient.getRetrofitInstance().create(ApiService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        EventsItem eventsItem = getIntent().getParcelableExtra("EVENTS_ITEM");



        TextView txtLeague = findViewById(R.id.txtLeague);
        TextView txtDate = findViewById(R.id.txtDate);
        TextView txtHome = findViewById(R.id.txtHome);
        ImageView ivHome = findViewById(R.id.ivHome);
        TextView txtScore = findViewById(R.id.txtScore);
        TextView txtAway = findViewById(R.id.txtAway);
        ImageView ivAway = findViewById(R.id.ivAway);
        TextView txtVenue = findViewById(R.id.txtVenue);
        TextView txtStatus = findViewById(R.id.txtStatus);
        Button btnFav = findViewById(R.id.btn_fav);

        txtLeague.setText(eventsItem.getStrLeague());
        txtDate.setText(eventsItem.getDateEvent());
        txtHome.setText(eventsItem.getStrHomeTeam());
        if (eventsItem.getIntAwayScore()==null){
            txtScore.setText(" : ");
        }else {
            txtScore.setText(eventsItem.getIntHomeScore()+" : "+eventsItem.getIntAwayScore());
        }

        txtAway.setText(eventsItem.getStrAwayTeam());
        txtVenue.setText(eventsItem.getStrVenue());
        txtStatus.setText(eventsItem.getStrStatus());

        getTeamBadge(eventsItem.getIdHomeTeam(), ivHome);
        getTeamBadge(eventsItem.getIdAwayTeam(), ivAway);

        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataHelper db = new DataHelper(getApplicationContext());
                db.addFavorite(eventsItem);

                Toast.makeText(getApplicationContext(),"Favorite Added : " + eventsItem.getStrEvent(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.favorites){
            Toast.makeText(this,"The Feature is in progress", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void getTeamBadge(String idTeam, ImageView ivBadge){
        Call<TeamResponse> api = service.getTeam(idTeam);
        api.enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                if (response.isSuccessful()) {
                    Picasso.get().load(response.body().getTeams().get(0).getStrTeamBadge())
                            .resize(100,100)
                            .into(ivBadge);
                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {

            }
        });
    }
}
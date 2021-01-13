package com.example.pcs_uas_0097.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pcs_uas_0097.R;
import com.example.pcs_uas_0097.adapter.NextMatchAdapter;
import com.example.pcs_uas_0097.adapter.PreviousMatchAdapter;
import com.example.pcs_uas_0097.api.ApiClient;
import com.example.pcs_uas_0097.api.ApiService;
import com.example.pcs_uas_0097.model.EventsItem;
import com.example.pcs_uas_0097.model.NextMatchResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NextFragment extends Fragment {

    private List<EventsItem> listEvents;
    private RecyclerView rvNextMatch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_next, container, false);
        rvNextMatch = view.findViewById(R.id.rv_nextmatch);
        rvNextMatch.setHasFixedSize(true);
        rvNextMatch.setLayoutManager(new LinearLayoutManager(getContext()));

        ApiService service = ApiClient.getRetrofitInstance().create(ApiService.class);
        Call<NextMatchResponse> call = service.getNextMatch("4328");
        call.enqueue(new Callback<NextMatchResponse>() {
            @Override
            public void onResponse(Call<NextMatchResponse> call, Response<NextMatchResponse> response) {
                listEvents = (List<EventsItem>) response.body().getEvents();

                PreviousMatchAdapter previousMatchAdapter = new PreviousMatchAdapter(listEvents);
                rvNextMatch.setAdapter(previousMatchAdapter);
            }

            @Override
            public void onFailure(Call<NextMatchResponse> call, Throwable t) {

            }
        });

        return view;
    }
}
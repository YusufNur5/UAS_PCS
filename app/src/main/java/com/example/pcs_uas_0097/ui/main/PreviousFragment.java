package com.example.pcs_uas_0097.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pcs_uas_0097.R;
import com.example.pcs_uas_0097.adapter.PreviousMatchAdapter;
import com.example.pcs_uas_0097.api.ApiClient;
import com.example.pcs_uas_0097.api.ApiService;
import com.example.pcs_uas_0097.model.EventsItem;
import com.example.pcs_uas_0097.model.PreviousMatchResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PreviousFragment extends Fragment {

    private List<EventsItem> listEvents;
    private RecyclerView rvPrevMatch;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_previous, container, false);
        rvPrevMatch = view.findViewById(R.id.rv_prevmatch);
        rvPrevMatch.setHasFixedSize(true);
        rvPrevMatch.setLayoutManager(new LinearLayoutManager(getContext()));

        ApiService service = ApiClient.getRetrofitInstance().create(ApiService.class);
        Call<PreviousMatchResponse> call = service.getPreviousMatch("4328");
        call.enqueue(new Callback<PreviousMatchResponse>() {
            @Override
            public void onResponse(Call<PreviousMatchResponse> call, Response<PreviousMatchResponse> response) {
                listEvents = (List<EventsItem>) response.body().getEvents();

                PreviousMatchAdapter previousMatchAdapter = new PreviousMatchAdapter(listEvents);
                rvPrevMatch.setAdapter(previousMatchAdapter);
            }

            @Override
            public void onFailure(Call<PreviousMatchResponse> call, Throwable t) {

            }
        });

        return view;
    }
}
package com.example.pcs_uas_0097.api;

import com.example.pcs_uas_0097.model.NextMatchResponse;
import com.example.pcs_uas_0097.model.PreviousMatchResponse;
import com.example.pcs_uas_0097.model.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("eventspastleague.php")
    Call<PreviousMatchResponse> getPreviousMatch(@Query("id") String id);

    @GET("eventsnextleague.php")
    Call<NextMatchResponse> getNextMatch(@Query("id") String id);

    @GET("lookupteam.php")
    Call<TeamResponse> getTeam(@Query("id") String id);
}

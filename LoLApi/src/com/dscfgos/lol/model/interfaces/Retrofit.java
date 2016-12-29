package com.dscfgos.lol.model.interfaces;

import java.util.List;
import java.util.Map;

import com.dscfgos.lol.model.classes.rest.Endpoints;
import com.dscfgos.lol.model.dtos.champion.Champion;
import com.dscfgos.lol.model.dtos.champion.ChampionList;
import com.dscfgos.lol.model.dtos.current_game.CurrentGameInfo;
import com.dscfgos.lol.model.dtos.featured_games.FeaturedGames;
import com.dscfgos.lol.model.dtos.game.RecentGames;
import com.dscfgos.lol.model.dtos.league.League;
import com.dscfgos.lol.model.dtos.match.MatchDetail;
import com.dscfgos.lol.model.dtos.match_list.MatchList;
import com.dscfgos.lol.model.dtos.static_data.Item;
import com.dscfgos.lol.model.dtos.static_data.ItemList;
import com.dscfgos.lol.model.dtos.static_data.LanguageStrings;
import com.dscfgos.lol.model.dtos.static_data.MapData;
import com.dscfgos.lol.model.dtos.static_data.Mastery;
import com.dscfgos.lol.model.dtos.static_data.MasteryList;
import com.dscfgos.lol.model.dtos.static_data.Realm;
import com.dscfgos.lol.model.dtos.static_data.Rune;
import com.dscfgos.lol.model.dtos.static_data.RuneList;
import com.dscfgos.lol.model.dtos.static_data.SummonerSpell;
import com.dscfgos.lol.model.dtos.static_data.SummonerSpellList;
import com.dscfgos.lol.model.dtos.stats.PlayerStatsSummaryList;
import com.dscfgos.lol.model.dtos.stats.RankedStats;
import com.dscfgos.lol.model.dtos.status.Shard;
import com.dscfgos.lol.model.dtos.status.ShardStatus;
import com.dscfgos.lol.model.dtos.summoner.MasteryPages;
import com.dscfgos.lol.model.dtos.summoner.RunePages;
import com.dscfgos.lol.model.dtos.summoner.Summoner;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Retrofit 
{
	//Champion
    @GET(Endpoints.LIST_CHAMPIONS)
    void getChampionsList(@Path("region") String region, @Query("freeToPlay") boolean freeToPlay, Callback<ChampionList> getListChampionsCallback);

    @GET(Endpoints.CHAMPION)
    void getChampion(@Path("region") String region, @Path("id") String id, Callback<Champion> getChampionCallback);
    
    //Current Game
    @GET(Endpoints.CURRENT_GAME)
    CurrentGameInfo getCurrentGameInfo(@Path("region") String region, @Path("summonerId") String summonerId);
    
    //Featured Games
    @GET(Endpoints.FEATURED_GAMES)
    FeaturedGames getFeaturedGames(@Path("region") String region);
    
    //Game
    @GET(Endpoints.GAME)
    RecentGames getRecentGames(@Path("region") String region, @Path("summonerId") String summonerId);
    
    //League
    @GET(Endpoints.LEAGUE_BY_SUMMONER_ALL)
    Map<String, List<League>> getAllLeaguesBySummonerId(@Path("region") String region, @Path("summonerIds") String summonerIds);

    @GET(Endpoints.LEAGUE_BY_SUMMONER)
    Map<String, List<League>> getLeagueBySummoner(@Path("region") String region, @Path("summonerIds") String summonerIds);

    @GET(Endpoints.LEAGUE_CHALLENGER)
    League getChallengerLeague(@Path("region") String region, @Query("type") String queueType);
    
    @GET(Endpoints.LEAGUE_MASTER)
    League getMasterLeague(@Path("region") String region, @Query("type") String queueType);
    
    //static-data
    @GET(Endpoints.STATIC_CHAMPIONS_DATA)
    ChampionList getStaticChampionsList(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version,
    		@Query("dataById") boolean dataById, 
    		@Query("champData") String champData);

    @GET(Endpoints.STATIC_CHAMPION)
    Champion getStaticChampion(@Path("region") String region, @Path("id") String id,
    		@Query("locale") String locale, 
    		@Query("version") String version, 
    		@Query("champData") String champData);
   
    @GET(Endpoints.STATIC_ITEMS)
    ItemList static_getItemsList(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version, 
    		@Query("itemListData") String itemListData);

    @GET(Endpoints.STATIC_ITEM)
    Item static_getItem(@Path("region") String region, @Path("id") String id,
    		@Query("locale") String locale, 
    		@Query("version") String version, 
    		@Query("itemData") String itemData);
    
    @GET(Endpoints.STATIC_STRINGS)
    LanguageStrings static_getLanguagesString(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version);
    
    @GET(Endpoints.STATIC_LANGUAGES)
    List<String> static_getLanguages(@Path("region") String region);
    
    @GET(Endpoints.STATIC_MAP)
    MapData static_getMap(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version);
    
    @GET(Endpoints.STATIC_MASTERIES)
    MasteryList static_getMasteriesList(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version,
		    @Query("masteryListData") String masteryListData);
    
    @GET(Endpoints.STATIC_MASTERY)
    Mastery static_getMastery(@Path("region") String region, @Path("id") Integer id,
    		@Query("locale") String locale, 
    		@Query("version") String version,
		    @Query("masteryData") String masteryData);
    
    @GET(Endpoints.STATIC_REALM)
    Realm getRealm(@Path("region") String region);
    
    @GET(Endpoints.STATIC_RUNES)
    RuneList static_getRunesList(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version,
		    @Query("runeListData") String runeListData);
    
    @GET(Endpoints.STATIC_RUNE)
    Rune static_getRune(@Path("region") String region, @Path("id") Integer id,
    		@Query("locale") String locale, 
    		@Query("version") String version,
		    @Query("runeData") String runeData);
    
    
    @GET(Endpoints.STATIC_SPELLS)
    SummonerSpellList static_getSpellsList(@Path("region") String region, 
    		@Query("locale") String locale, 
    		@Query("version") String version, 
    		@Query("dataById") boolean dataById, 
    		@Query("spellData") String spellData);

    @GET(Endpoints.STATIC_SPELL)
    SummonerSpell static_getSpell(@Path("region") String region, @Path("id") Integer id,
    		@Query("locale") String locale, 
    		@Query("version") String version, 
    		@Query("spellData") String spellData);
    
    //status
    @GET(Endpoints.SERVERS_LIST)
    List<Shard> getServersList();

    @GET(Endpoints.SERVERS_STATUS)
    ShardStatus getServerStatus(@Path("shard") String shard);
    
    //match
    @GET(Endpoints.MATCH)
    MatchDetail getMatchDetail(@Path("region") String region, @Path("matchId") String matchId, 
    		@Query("includeTimeline") boolean includeTimeline);

    //match list
    @GET(Endpoints.MATCH_LIST)
    MatchList getMatchList(@Path("region") String region, @Path("summonerIds") String summonerIds, 
    		 @Query("championIds") String championIds ,
    		 @Query("rankedQueues") String rankedQueues ,
    		 @Query("seasons") String seasons ,
    		 @Query("beginTime") Long beginTime ,
    		 @Query("beginIndex") Integer beginIndex ,
    		 @Query("endIndex") Integer endIndex);
    
    
    //stats
    @GET(Endpoints.STATS_RANKED)
    RankedStats getStatsRanked(@Path("region") String region, @Path("summonerId") String summonerId, 
    		@Query("season") String season);
    
    @GET(Endpoints.STATS_SUMMARY)
    PlayerStatsSummaryList getStatsSummary(@Path("region") String region, @Path("summonerId") String summonerId , 
    		@Query("season") String season);

	//summoner
    @GET(Endpoints.SUMMONER_DATA_BY_NAME)
    Map<String, Summoner> getSummonerDataByName(@Path("region") String region, @Path("summonerNames") String summonerNames);

    @GET(Endpoints.SUMMONER_DATA)
    Map<String, Summoner> getSummonerDataById(@Path("region") String region, @Path("summonerIds") String summonerIds);

    @GET(Endpoints.SUMMONER_NAME)
    void getSummonerName(@Path("region") String region, @Path("summonerIds") String summonerIds, Callback<Map<String, String>> getSummonerNameCallback);

    @GET(Endpoints.SUMMONER_MASTERIES)
    void getSummonerMasteries(@Path("region") String region, @Path("summonerIds") String summonerIds, Callback<Map<String, MasteryPages>> getSummonerMasteriesCallback);

    @GET(Endpoints.SUMMONER_RUNES)
    void getSummonerRunes(@Path("region") String region, @Path("summonerIds") String summonerIds, Callback<Map<String, RunePages>> getSummonerRunesCallback);
}

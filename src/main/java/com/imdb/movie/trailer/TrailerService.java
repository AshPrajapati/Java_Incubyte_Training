package com.imdb.movie.trailer;

public class TrailerService {
    private TrailerRepository trailerRepository;
    public TrailerService(TrailerRepository M)
    {
        this.trailerRepository =M;
    }
    public String getTrailer(int id){
        return trailerRepository.getById(id).getUrl();
    }
}

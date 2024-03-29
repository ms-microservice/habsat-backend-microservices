package pl.edu.pk.cosmo.habsatbackend.entity.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.List;

@Data
@Accessors(chain = true)
public class FlightResponse {
    private LocalDate date;
    private String description;
    private String title;
    private List<FlightDataResponse> flightDataResponseList;
}

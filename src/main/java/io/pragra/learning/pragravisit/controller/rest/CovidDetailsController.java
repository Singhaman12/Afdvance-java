package io.pragra.learning.pragravisit.controller.rest;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponse;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name="CovidDetails")
@Data
public class CovidDetailsController {
    private final CovidDetailService service;

    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Return covid details"),
                    @ApiResponse(code = 400, message = "Not Found", response = PragraError.class)
            }
    )
    @GetMapping("/covid-details/{id}")
    public ResponseEntity<List<CovidDetail>> getAllCovidDetails(@PathVariable("id") int id) {
        return ResponseEntity.status(200).header("X-SENDER", "PRAGRA")
                .body(service.getAllDetails(id));

    }

    @PostMapping("/visitor/{id}/covid-details")
    public ResponseEntity<?> createCovidDetails(@PathVariable("id") int id, @RequestBody CovidDetail covidDetail){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createCovidDetails(covidDetail,id));
    }

}

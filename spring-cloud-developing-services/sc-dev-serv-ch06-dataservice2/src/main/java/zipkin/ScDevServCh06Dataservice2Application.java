package zipkin;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import brave.Tracer;

@RestController
@SpringBootApplication
public class ScDevServCh06Dataservice2Application {
	
	@Autowired
	private Tracer tracer;

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh06Dataservice2Application.class, args);
	}

	@RequestMapping(value="/customer/{cid}/vehicledetails", method=RequestMethod.GET)
	public @ResponseBody String getCustomerVehicleDetails(@PathVariable Integer cid) {
		
		Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
		vehicles.put(100, "Lincoln Continental; Plate SNUG30");
		vehicles.put(101, "Chevrolet Camaro; Plate R7TYR43");
		vehicles.put(102, "Volkswagen Beetle; Plate 6CVI3E2");
		
		String result = vehicles.get(cid);
		
		return result;
	}
	
}

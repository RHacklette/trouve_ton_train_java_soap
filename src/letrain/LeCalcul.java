package letrain;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class LeCalcul {
    @WebMethod
    public double calculDistance(double longitudeA, double longitudeB, double latitudeA, double latitudeB) {
        longitudeA = Math.toRadians(longitudeA);
        longitudeB = Math.toRadians(longitudeB);
        latitudeA = Math.toRadians(latitudeA);
        latitudeB = Math.toRadians(latitudeB);
        double d = longitudeB - longitudeA;
        double r = Math.acos((Math.sin(latitudeA) * Math.sin(latitudeB)) + (Math.cos(latitudeA) * Math.cos(latitudeB) * Math.cos(d)));
        //double result = (r * 6378137) / 1000;
	double t = Math.toDegrees(r);
	double result = t * 60 * 1.1515 * 1.609344;
        System.out.println(result);
        return result;
    }
}

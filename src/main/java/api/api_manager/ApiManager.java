package api.api_manager;

import api.models.google_places.GooglePlacesModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class ApiManager {
    @Getter
    @Setter
    
    public GooglePlacesModel googlePlacesModel = new GooglePlacesModel();

}

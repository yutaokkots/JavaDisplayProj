package com.yutaokkotsu.display;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
package com.yutaokkotsu.display;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
// instead of writing out getter/setter for each private property (below)
// import Data from Lombok project

public class Movie {

    // @Id lets frameworkknow this is the unique identifier

    @Id
    private ObjectId id;
    private String title;
    private Number releaseYear;
    private String mpaaRating;
    private List<String> cast;
    private Boolean nowShowing;
    private List<String> reviews;
}

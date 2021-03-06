package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * Model representing a popular games on twitch.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class TopGameList {

	@JsonProperty("_total")
	private int total;

	private List<TopGame> top;
}

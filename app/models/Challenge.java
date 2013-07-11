package models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Challenge extends Model {
	@Id
	public Long id;
/*
	@Formats.DateTime(pattern="hh:mm")
	public Time wakeUpTime;
	
	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date startDate;
*/
	@Constraints.Required
	public String objective;
}

package controllers;

import java.util.List;

import models.Challenge;
import play.data.Form;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("WakeUp!"));
    }
    
    public static Result addChallenge() {
    	Challenge challenge = Form.form(Challenge.class).bindFromRequest().get();
    	challenge.save();
    	return redirect(routes.Application.index());
    }
    
    public static Result getChallenges() {
    	List<Challenge> challenges = new Model.Finder<Long, Challenge>(Long.class, Challenge.class).all();
    	return ok(Json.toJson(challenges));
    }

}

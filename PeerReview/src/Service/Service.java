package Service;

import UI.UserInterface;
import RLObjects.Researcher;
import RLObjects.Conference;
import RLObjects.Article;
import java.util.*;

public class Service {

    public Database db;

    /**
     * Default constructor
     */
    public Service() {
    }

    /**
     * @param db
     */
    public void Service(Database db) {
        // TODO implement here
    }

    /**
     * @param conference 
     * @param numReviewers 
     * @param ui 
     * @return
     */
    public void allocArticlesToMembers(Conference conference, int numReviewers, UserInterface ui) {
        // TODO implement here
        //return null;
    }

    /**
     * @param article 
     * @param reviewer 
     * @param rate 
     * @param ui
     */
    public void rateArticle(Article article, Researcher reviewer, float rate, UserInterface ui) {
        // TODO implement here
    }

    /**
     * @param conference 
     * @param ui
     */
    public void selectArticle(Conference conference, UserInterface ui) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Conference readConference() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Researcher readResearcher() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Article readArticle() {
        // TODO implement here
        return null;
    }

}
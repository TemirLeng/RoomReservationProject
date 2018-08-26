package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import utilities.BrowserUtils;
import utilities.DBUtils;
import utilities.Driver;

import java.util.Map;

public class SPA1017_steps {

    Homepage hp=new Homepage();

    @Then("the user click on myself button")
    public void the_user_click_on_myself_button() {
        BrowserUtils.waitFor(1);
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(hp.my).perform();
        BrowserUtils.waitFor(1);
        action.moveToElement(hp.self).perform();
        hp.self.click();
    }

    @Then("the user get datas and verify from DataBase")
    public void the_user_get_datas_and_verify_from_DataBase(Map<String,String> list) {

        DBUtils.createConnection();
        String query="select users.firstname||' '||users.lastname as name,users.role,team.name as team,team.batch_number,campus.location from users \n" +
                "join team on users.team_id=team.id join campus on team.campus_id=campus.id\n" +
                "where users.firstname='Kanya';";
        Assert.assertEquals(list.get("name"),DBUtils.getColumnData(query,"name").get(0).toString());
        Assert.assertEquals(list.get("role"),DBUtils.getColumnData(query,"role").get(0).toString());
        Assert.assertEquals(list.get("team"),DBUtils.getColumnData(query,"team").get(0).toString());
        Assert.assertEquals(list.get("batch"),DBUtils.getColumnData(query,"batch_number").get(0).toString());
        Assert.assertEquals(list.get("campus"),DBUtils.getColumnData(query,"location").get(0).toString());
    }
}

package uk.co.library.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class TesterJobSearchSteps {
    @When("^User enters Job Title \"([^\"]*)\"$")
    public void userEntersJobTitle(String jobTitle)  {
        new HomePage().acceptCookies();
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^User enters Location \"([^\"]*)\"$")
    public void userEntersLocation(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^User enters Distance \"([^\"]*)\"$")
    public void userEntersDistance(String distance)  {
        new HomePage().selectDistance(distance);
    }

    @And("^User clicks on 'More Search Options'$")
    public void userClicksOnMoreSearchOptions() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^User enters \"([^\"]*)\" as minimum salary$")
    public void userEntersAsMinimumSalary(String salaryMin)  {
            new HomePage().enterMinSalary(salaryMin);
    }

    @And("^User enters \"([^\"]*)\" as maximum salary$")
    public void userEntersAsMaximumSalary(String salaryMax)  {
            new HomePage().enterMaxSalary(salaryMax);
    }

    @And("^User selects Salary Type \"([^\"]*)\" from dropdown menu$")
    public void userSelectsSalaryTypeFromDropdownMenu(String salaryType)  {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^User selects Job Type \"([^\"]*)\" from dropdown menu$")
    public void userSelectsJobTypeFromDropdownMenu(String jobType)  {
        new HomePage().selectJobType(jobType);
    }

    @And("^User clicks on 'Find Jobs' button$")
    public void userClicksOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("^User is able see job search results successfully under header message \"([^\"]*)\"$")
    public void userIsAbleSeeJobSearchResultsSuccessfullyUnderHeaderMessage(String message)  {
        new ResultPage().verifyTheResults(message);
    }
}

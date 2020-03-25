package NopCucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class MyStepdefs extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    BookCategoryComparisionPage bookCategoryComparisionPage = new BookCategoryComparisionPage();
    BookCategoryComparisionResultPage bookCategoryComparisionResultPage = new BookCategoryComparisionResultPage();
    RegisteredUserReferetoFreiend registeredUserReferetoFreiend = new RegisteredUserReferetoFreiend();
    RegisteredUserReferToAFriendResultPage registeredUserReferToAFriendResultPage = new RegisteredUserReferToAFriendResultPage();
    NonRegisteredReferToAFriend nonRegisteredReferToAFriend = new NonRegisteredReferToAFriend();
    NonRegisteredReferToAFreinedResultPage nonRegisteredReferToAFreinedResultPage = new NonRegisteredReferToAFreinedResultPage();
    CategoryPagePriceHighToLow categoryPagePriceHighToLow = new CategoryPagePriceHighToLow();
    CategoryPagePriceHighToLowResultPage categoryPagePriceHighToLowResultPage = new CategoryPagePriceHighToLowResultPage();
    GuestComments guestComments = new GuestComments();
    GuestCommentsResults guestCommentsResults = new GuestCommentsResults();
    AddtoCartFeatureProducts addtoCartFeatureProducts = new AddtoCartFeatureProducts();
    AddtoCartForFeaturedProductsResultPage addtoCartForFeaturedProductsResultPage = new AddtoCartForFeaturedProductsResultPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    ChangeCurrencyResultPage changeCurrencyResultPage = new ChangeCurrencyResultPage();
    GuestCheckOut guestCheckOut = new GuestCheckOut();
    GuestCheckoutResultPage guestCheckoutResultPage = new GuestCheckoutResultPage();


/////////////////////////////////////////////////////  PROGRAMME 1 ////////////////////////////////////////////////////
    @Given("user is on Home Page")
    public void userIsOnHomePage() {
    browserSelector.openBrowser();
    }

    @When("user click on Register Button")

    public void userClickOnRegisterButton() {
        homePage.clickOnRegisterButton();
    }

    @And("enter Firstname")

    public void enterFirstname() {
        registrationPage.userEnterRegistrationDetails();
    }

    @And("enter Lastname")
    public void enterLastname() {
    }

    @And("enter Email address")
    public void enterEmailAddress() {
    }

    @And("enter password")
    public void enterPassword() {
    }

    @And("enter confirm password")
    public void enterConfirmPassword() {
    }

    @And("click on Register button")
    public void clickOnRegisterButton() {
    }

    @Then("user should be registered successfully")
    public void userShouldBeRegisteredSuccessfully() {
    }

    @And("your registration Completed message should be displayed")
    public void yourRegistrationCompletedMessageShouldBeDisplayed() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        browserSelector.quitBrowser();
    }

    /////////////////////////////////////////////////////  PROGRAMME 2 /////////////////////////////////////////////////
    @Given("user is already on home page")
    public void userIsAlreadyOnHomePage() {
        browserSelector.openBrowser();
    }

    @When("User click on Book___Category")
    public void userClickOnBook___Category() {
        bookCategoryComparisionPage.selectProductsToCompare();

    }

    @And("user Click on Add to Compare for product Fahrenheit by Ray Bradbury")
    public void userClickOnAddToCompareForProductFahrenheitByRayBradbury() {
    }

    @And("click on Add to Compare for product First Prize Pies")
    public void clickOnAddToCompareForProductFirstPrizePies() {
    }

    @And("click on Product comparison on Popup Bar")
    public void clickOnProductComparisonOnPopupBar() {
    }

    @Then("user should compare two different products")
    public void userShouldCompareTwoDifferentProducts() {
    }

    @And("compare Products message should be displayed")
    public void compareProductsMessageShouldBeDisplayed() {
        bookCategoryComparisionResultPage.usershouldseeComparisionResult();
        browserSelector.quitBrowser();
    }
//////////////////////////////////////////////////////  PROGRAMME 3 ////////////////////////////////////////////////////
    @Given("user is logged in and is on Home Page")
    public void userIsLoggedInAndIsOnHomePage() {browserSelector.openBrowser();

    }

    @When("user click on Book_Category")
    public void userClickOnBook_Category() {
        registeredUserReferetoFreiend.logInAndSelectProductToRefer();
    }

    @And("Click on Click on product Fahrenheit by Ray Bradbury")
    public void clickOnClickOnProductFahrenheitByRayBradbury() {
    }

    @And("Click on Email a Friend")
    public void clickOnEmailAFriend() {
    }

    @And("Enter Friend's email address")
    public void enterFriendSEmailAddress() {
    }

    @And("Click on Send Email button")
    public void clickOnSendEmailButton() {
    }

    @Then("User should be able to refer Product to a Friend")
    public void userShouldBeAbleToReferProductToAFriend() {
    }

    @And("Your message has been sent message should be displayed.")
    public void yourMessageHasBeenSentMessageShouldBeDisplayed() {
        registeredUserReferToAFriendResultPage.RegisteredUserShouldbeAbleToReferToAFriend();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 4 /////////////////////////////////////////////////
    @Given("user navigate to homepage")
    public void userNavigateToHomepage() {
        browserSelector.openBrowser();
    }

    @When("user click on Book__Category")
    public void userClickOnBook__Category() {
        nonRegisteredReferToAFriend.nonRegisteredUserSelectProdutToReferToaFriend();
    }

    @And("click on Click on product Fahrenheit Ray Bradbury")
    public void clickOnClickOnProductFahrenheitRayBradbury() {
    }

    @And("click on Email Friend")
    public void clickOnEmailFriend() {
    }

    @And("enter Friends email address")
    public void enterFriendsEmailAddress() {
    }

    @And("enter your email address")
    public void enterYourEmailAddress() {
    }

    @And("click on Send_Email button")
    public void clickOnSend_EmailButton() {
    }

    @Then("user should not be able to refer Product to a Friend")
    public void userShouldNotBeAbleToReferProductToAFriend() {
    }

    @And("error message Only registered customers can use email a friend feature should be displayed")
    public void errorMessageOnlyRegisteredCustomersCanUseEmailAFriendFeatureShouldBeDisplayed() {
        nonRegisteredReferToAFreinedResultPage.nonRegisteredUserShouldNotbeAbleToReferToAFriend();
        browserSelector.quitBrowser();
    }

    /////////////////////////////////////////////////////  PROGRAMME 5 ////////////////////////////////////////////////
       @Given("User is on home__page")
    public void userIsOnHome__Page() {
           browserSelector.openBrowser();
    }

    @When("User click on Book__Category")
    public void userClickOn__BookCategory() {
        categoryPagePriceHighToLow.sortPriceHighToLow();
    }

    @And("Click on Filter Sort By")
    public void clickOnFilterSortBy() {
    }

    @And("Select Price High to Low")
    public void selectPriceHighToLow() {
    }

    @Then("user should be able to sort price High to Low")
    public void userShouldBeAbleToSortPriceHighToLow() {
        browserSelector.quitBrowser();
    }
    ///////////////////////////////////////////////////  PROGRAMME 6 ////////////////////////////////////////////////////
    @Given("user is on HomePage_")
    public void userIsOnHomePage_() {
        browserSelector.openBrowser();
    }

    @When("user click on Details Button under News")
    public void userClickOnDetailsButtonUnderNews() {
        guestComments.addComments();
    }

    @And("enter Title")
    public void enterTitle() {
    }

    @And("enter comments")
    public void enterComments() {
    }

    @And("click on New Comments button")
    public void clickOnNewCommentsButton() {
    }

    @Then("user should add comments successfully")
    public void userShouldAddCommentsSuccessfully() {
        guestCommentsResults.verifyGuestUserSeeCommentsSuccessfulMessage();
    }

    @And("message should display News comment is successfully added")
    public void messageShouldDisplayNewsCommentIsSuccessfullyAdded() {
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 7 /////////////////////////////////////////////////
    @Given("user is on home__page")
    public void userIsOnHome__page() {
        browserSelector.openBrowser();
    }

    @When("user click on US Dollar")
    public void userClickOnUSDollar() {

    }

    @And("select Euro Currency")
    public void selectEuroCurrency() {
        changeCurrency.selectCurrencyUsDollarToEuro();

    }

    @Then("user should change currency code to Euro")
    public void userShouldChangeCurrencyCodeToEuro() {
        changeCurrencyResultPage.verifycurrencyChangeUsDollarToEuro();
    }

    @And("click on Euro")
    public void clickOnEuro() {
    }

    @And("select US Dollar")
    public void selectUSDollar() {
        changeCurrency.selectCurrencyEuroToUsDollar();
    }

    @Then("user should change currency code to US dollar")
    public void userShouldChangeCurrencyCodeToUSDollar() {
        changeCurrencyResultPage.verifycurrencyChangeEuroToUSDollar();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 8 /////////////////////////////////////////////////
    @Given("user is on Home___Page")
    public void userIsOnHome___Page() {
        browserSelector.openBrowser();
    }

    @When("user Scroll Down page to Feature Products")
    public void userScrollDownPageToFeatureProducts() {
        addtoCartFeatureProducts.scrollDown();
    }

    @Then("user should see Add to Cart Button on all Featured products")
    public void userShouldSeeAddToCartButtonOnAllFeaturedProducts() {
        addtoCartForFeaturedProductsResultPage.verifyAddtoCartButtonIsPresent();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 9 /////////////////////////////////////////////////

    @Given("user is on Homepage")
    public void userIsOnHomepage() {
        browserSelector.openBrowser();
    }

    @When("Click on Book-Category")
    public void clickOnBookCategory() {
        guestCheckOut.enterDetailsForCheckout();
    }

    @And("click on Product First-Prize-Pies")
    public void clickOnProductFirstPrizePies() {
    }

    @And("click on Add to Cart Button")
    public void clickOnAddToCartButton() {
    }

    @And("click on Shopping Cart Button on Popup Bar")
    public void clickOnShoppingCartButtonOnPopupBar() {
    }

    @And("click on Agree Terms and Conditions Tick-Box")
    public void clickOnAgreeTermsAndConditionsTickBox() {
    }

    @And("click on Checkout Button")
    public void clickOnCheckoutButton() {
    }

    @And("click on Checkout as a Guest Button")
    public void clickOnCheckoutAsAGuestButton() {
    }

    @And("enter guest Customer Details")
    public void enterGuestCustomerDetails() {
    }

    @And("click on Continue_Button")
    public void clickOnContinue_Button() {
    }

    @And("click on Credit Card")
    public void clickOnCreditCard() {
    }

    @And("click on Continue-button")
    public void clickOnContinueButton() {
    }

    @And("select MasterCard Credit Card")
    public void selectMasterCardCreditCard() {
    }

    @And("enter payment details")
    public void enterPaymentDetails() {
    }

    @And("click on Confirm button")
    public void clickOnConfirmButton() {
    }

    @Then("guest user should checkout successfully")
    public void guestUserShouldCheckoutSuccessfully() {
    }

    @And("message should display Your order has been successfully processed")
    public void messageShouldDisplayYourOrderHasBeenSuccessfullyProcessed() {
        guestCheckoutResultPage.verifyCheckoutSuccessfulMessage();
        browserSelector.quitBrowser();
    }


//.......................................................................................................


}

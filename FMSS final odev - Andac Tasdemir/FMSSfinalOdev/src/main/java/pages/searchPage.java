package pages;

public class searchPage {

    public String pageSource = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String adminModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/admin/viewAdminModule']";
    public String userRolesTextboxClickXpath = "(//div[@class='oxd-select-text oxd-select-text--active']/div[@tabindex='0'])[1]";
    public String secondOptionXpath = "//div[@role='listbox']//div[@role='option'][2]";
    public String searchButtonXpath = "//button[@type='submit']";
    public String buzzModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/buzz/viewBuzz']";
    public String postFieldXpath = "//textarea[@placeholder=\"What's on your mind?\"]";
    public String postButtonXpath = "//button[@type='submit']";
    public String performanceModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/performance/viewPerformanceModule']";
    public String myTrackerModuleXpath = "//li[@class='oxd-topbar-body-nav-tab']/a[@class='oxd-topbar-body-nav-tab-item']";
    public String viewButtonXpath = "//button[@name='view']";
    public String addLogButtonXpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
    public String logFieldXpath = "//input[@placeholder='Type here']";
    public String commentFieldXpath = "//textarea[@placeholder='Type here']";
    public String saveButtonXpath = "//button[@type='submit']";
    public String recruitmentModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/recruitment/viewRecruitmentModule']";
    public String vacanciesModuleLinkXpath = "//li[@class='oxd-topbar-body-nav-tab']";
    public String vacancySortItemXpath = "//i[@class='oxd-icon bi-sort-alpha-down oxd-icon-button__icon oxd-table-header-sort-icon']";
    public String sortDescendingXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div/ul/li[2]";
    public String myInfoModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/pim/viewMyDetails']";
    public String contactDetailsClickXpath = "//a[@href='/web/index.php/pim/contactDetails/empNumber/7']";
    public String emailFieldXpath = "//input[@modelmodifiers='[object Object]']";
    public String claimModuleLinkXpath = "//li[@class='oxd-main-menu-item-wrapper']/a[@href='/web/index.php/claim/viewClaimModule']";
    public String assignClaimButtonXpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
    public String hintFieldXpath = "//input[@placeholder='Type for hints...']";
    public String listboxOptionXpath = "//div[@role='listbox']//div[@role='option']";
    public String currencyTextboxClickXpath = "(//div[@class='oxd-select-text oxd-select-text--active']/div[@tabindex='0'])[2]";
    public String profileModuleLinkXpath = "//span[@class='oxd-userdropdown-tab']";
    public String logoutButtonXpath = "//a[@href='/web/index.php/auth/logout']";
}

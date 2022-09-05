package stepDefinitions.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TractorVendorRelationshipPage extends BasePage {

    public final By TractorVendorCodeRelationshipMaintenanceHeader = By.xpath("//*[@id=\"mainDiv\"]/div[1]/div[1]/h4/strong/span");
    public final By Search = By.id("btnSearch");
    public final By UnitNumber = By.id("SearchTractorUnitNumber_I");
    public final By OwnerId = By.id("SearchOwnerId_I");
    public final By VendorCode = By.id("SearchVendorCodePartial_I");
    public final By OwnerOrVendorName = By.id("txtSearch");
    public final By Report = By.id("btnReport");
    public final By New = By.id("btnNewSettlement12");
    public final By ReportNotInRelationship = By.id("btnNotInRelationship");

    public final By View = By.xpath("//*[@id=\"btnAddTractorVendorRelation\"]");
    public final By Edit = By.xpath("//*[@id=\"btnAddTractorVendorRelation\"]");
    public final By RemoveRelationship = By.id("btnNotInRelationship");

    public final By CrossIconPopup = By.id("crossIconPopup");
    public final By Cancel = By.id("btnCancel");
    //*[@id="btnCancel"]

    //*[@id="crossIconPopup"]
    public TractorVendorRelationshipPage(WebDriver driver) {
        super(driver);
    }
}

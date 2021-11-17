package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;
import steps.Value;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Avito")
public class AvitoPage extends WebPage {

    @Name("списке категорий")
    private final SelenideElement categoryDropDown = $x("//*[@id=\"category\"]");
    @Name("оргтехника")
    private final SelenideElement orgtehnika = $x("//*[@data-marker=\"option(99)\"]");
    @Name("поиска")
    private final SelenideElement searchField = $x("//*[@class=\"input-input-Zpzc1\"]");
    @Name("выпадающему списку региона")
    private final SelenideElement regionDropDown = $x("//*[@data-marker=\"search-form/region\"]");
    @Name("регион")
    private final SelenideElement regionField = $x("//*[@data-marker=\"popup-location/region/input\"]");
    @Name("показать обьявления")
    private final SelenideElement saveButton = $x("//*[@data-marker=\"popup-location/save-button\"]");
    @Name("фотографией")
    private final SelenideElement fotoChechBox = $x("//span[text()=\"только с фото\"]");
    @Name("сортировка")
    private final SelenideElement sortDropDown = $x("//*[@class=\"index-topPanel-McfCA\"]/div/select[@class=\"select-select-IdfiC\"]");
    Value value = Value.ПО_УМОЛЧАНИЮ;
    private String sortDate = String.format("//*[@class=\"index-topPanel-McfCA\"]" +
            "/div/select[@class=\"select-select-IdfiC\"]" +
            "/option[@value=\"%s\"]", value.getOption());

    public String getSortDate() {
        return sortDate;
    }

    public SelenideElement getSearchName(int x) {
        SelenideElement name = $x(String.format("(//*[@data-marker=\"catalog-serp\"]" +
                "/div/div/div/div/a/h3[@itemprop=\"name\"])[%d]", x));
        return name;
    }

    public SelenideElement getPrice(int x) {
        SelenideElement price = $x(String.format("(//*[@data-marker=\"catalog-serp\"]" +
                "/div/div/div/div/span/span/meta[@itemprop=\"price\"])[%d]", x));
        return price;
    }


}

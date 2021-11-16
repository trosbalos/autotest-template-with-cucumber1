package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

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

    @Name("Дороже")
    private SelenideElement sortExpensive = $x("//*[@class=\"index-topPanel-McfCA\"]/div/select[@class=\"select-select-IdfiC\"]/option[@value=\"2\"]");
    @Name("Дешевле")
    private SelenideElement sortCheap = $x("//*[@class=\"index-topPanel-McfCA\"]/div/select[@class=\"select-select-IdfiC\"]/option[@value=\"1\"]");
    @Name("По умолчанию")
    private SelenideElement sortDefault = $x("//*[@class=\"index-topPanel-McfCA\"]/div/select[@class=\"select-select-IdfiC\"]/option[@value=\"101\"]");
    @Name("По дате")
    private SelenideElement sortDate = $x("//*[@class=\"index-topPanel-McfCA\"]/div/select[@class=\"select-select-IdfiC\"]/option[@value=\"104\"]");
//    private SelenideElement searchName = $x("(//*[@data-marker=\"catalog-serp\"]/div/div/div/div/a/h3[@itemprop=\"name\"])[%d]");
//    private SelenideElement price = $x("(//*[@data-marker=\"catalog-serp\"]/div/div/div/div/span/span/meta[@itemprop=\"price\"][%d])");

    public SelenideElement getSearchName(int x) {
        SelenideElement name = $x(String.format("(//*[@data-marker=\"catalog-serp\"]/div/div/div/div/a/h3[@itemprop=\"name\"])[%d]", x));
        return name;
    }

    public SelenideElement getPrice(int x) {
        SelenideElement price = $x(String.format("(//*[@data-marker=\"catalog-serp\"]/div/div/div/div/span/span/meta[@itemprop=\"price\"])[%d]", x));
        return price;
    }


}

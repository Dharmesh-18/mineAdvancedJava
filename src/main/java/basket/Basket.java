package basket;

import java.util.Iterator;
import java.util.List;

public class Basket {
  private List<Item> items;

  Basket(List<Item> items) {
    this.items = items;
  }

  public float getBasketTotal() {
    Iterator<Item> iterator = items.iterator();
    float basketTotal = 0.0f;
    while(iterator.hasNext()) {
      Item item = iterator.next();
      basketTotal = basketTotal + item.getTotalPrice();
    }
    return basketTotal;
  }

//  public float getTotalPrice(Item i) {
//    float price = i.getPrice() + i.getTax();
//    if (i.isOnSale())
//      price = price - i.getSaleDiscount();
//    return price;
//  }
}


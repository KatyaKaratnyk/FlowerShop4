package com.butterfly;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 Item item1 = new FlowerBucket();
	 item1.addFlower(new Rose(35));
	 item1.addFlower(new Cactus(37, FlowerForm.Round));
	 item1.addFlower(new Chamomile(72));
	 item1.searchFlower("Cactus");

	 item1 = new RibbonDecorator(item1);
	 item1 = new BasketDecorator(item1);
	 item1 = new PaperDecorator(item1);
	 System.out.println(item1.getPrice());


	 Item item2 = new FlowerBucket();
	 item2.addFlower(new Rose(42));
	 item2.addFlower(new Cactus(15, FlowerForm.Longitudinally));
	 item2.addFlower(new Chamomile(32));
	 item2 = new RibbonDecorator(item2);
	 item2 = new BasketDecorator(item2);
	 System.out.println(item2.getPrice());
	 item2.searchFlower(26);

	 Item item3 = new FlowerBucket();
	 item3.addFlower(new Rose(35));
	 item3.addFlower(new Cactus(37, FlowerForm.Round));
	 item3.addFlower(new Cactus(29, FlowerForm.Square));

	 item3 = new RibbonDecorator(item3);
	 item3 = new PaperDecorator(item3);
	 System.out.println(item3.getPrice());
	 item3.searchFlower(FlowerColor.BLUE);

	 Order youOrder = new Order();
	 youOrder.addItems(item1);
	 youOrder.addItems(item2);
	 youOrder.addItems(item3);
	 youOrder.processOrder();

	 youOrder.setDeliverStrategy(new PostDeliveryStrategy());
	 youOrder.performDeliver();
	 System.out.println(youOrder.calculateTotalPrice());

	 youOrder.setPaymentStrategy(new PayPalPaymentStrategy());
	 youOrder.performPayment();

	 youOrder.processOrder();
	 youOrder.removeItem(item2);
	 youOrder.processOrder();
	 System.out.println(new Cactus(24,FlowerForm.Square));




    }
}

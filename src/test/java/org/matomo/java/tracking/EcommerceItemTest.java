/*
 * Matomo Java Tracker
 *
 * @link https://github.com/matomo/matomo-java-tracker
 * @license https://github.com/matomo/matomo-java-tracker/blob/master/LICENSE BSD-3 Clause
 */
package org.matomo.java.tracking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author brettcsorba
 */
public class EcommerceItemTest {
  EcommerceItem ecommerceItem;

  public EcommerceItemTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    ecommerceItem = new EcommerceItem(null, null, null, null, null);
  }

  @After
  public void tearDown() {
  }

  /**
   * Test of constructor, of class EcommerceItem.
   */
  @Test
  public void testConstructor() {
    EcommerceItem ecommerceItem = new EcommerceItem("sku", "name", "category", 1.0, 1);

    assertEquals("sku", ecommerceItem.getSku());
    assertEquals("name", ecommerceItem.getName());
    assertEquals("category", ecommerceItem.getCategory());
    assertEquals(new Double(1.0), ecommerceItem.getPrice());
    assertEquals(new Integer(1), ecommerceItem.getQuantity());
  }

  /**
   * Test of getSku method, of class EcommerceItem.
   */
  @Test
  public void testGetSku() {
    ecommerceItem.setSku("sku");

    assertEquals("sku", ecommerceItem.getSku());
  }

  /**
   * Test of getName method, of class EcommerceItem.
   */
  @Test
  public void testGetName() {
    ecommerceItem.setName("name");

    assertEquals("name", ecommerceItem.getName());
  }

  /**
   * Test of getCategory method, of class EcommerceItem.
   */
  @Test
  public void testGetCategory() {
    ecommerceItem.setCategory("category");

    assertEquals("category", ecommerceItem.getCategory());
  }

  /**
   * Test of getPrice method, of class EcommerceItem.
   */
  @Test
  public void testGetPrice() {
    ecommerceItem.setPrice(1.0);

    assertEquals(new Double(1.0), ecommerceItem.getPrice());
  }

  /**
   * Test of getQuantity method, of class EcommerceItem.
   */
  @Test
  public void testGetQuantity() {
    ecommerceItem.setQuantity(1);

    assertEquals(new Integer(1), ecommerceItem.getQuantity());
  }


}

/**
 * 
 */
package com.revature.plagex.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Travis Rigg
 *
 */
public class UserTest {
  User testUser;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    testUser = new User("Emma");
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for {@link com.revature.plagex.beans.User#hashCode()}.
   */
  @Test
  public void testHashCode() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link com.revature.plagex.beans.User#getUsername()}.
   */
  @Test
  public void testGetUsername() {
    assertEquals(new User("Emma"), testUser);
  }

  /**
   * Test method for {@link com.revature.plagex.beans.User#setUsername(java.lang.String)}.
   */
  @Test
  public void testSetUsername() {
    testUser.setUsername("Olivia");
    assertEquals(new User("Olivia"), testUser);
  }

  /**
   * Test method for {@link com.revature.plagex.beans.User#equals(java.lang.Object)}.
   */
  @Test
  public void testEqualsObject() {
    assertTrue(testUser.equals(new User("Emma")));
  }

  /**
   * Test method for {@link com.revature.plagex.beans.User#toString()}.
   */
  @Test
  public void testToString() {
    fail("Not yet implemented");
  }

}

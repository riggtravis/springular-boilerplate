/**
 * A user object will almost always be useful
 */
package com.revature.plagex.domains;

import javax.persistence.Entity;

/**
 * @author Travis Rigg
 *
 */
@Entity
public class User {
  // This username probably shouldn't also be the id
  private String username;
  
  public User() {
    this.username = "";
  }
  
  public User(String username) {
    this.username = username;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }
  
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
  
  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;

/**
 *
 * @author Lenovo
 */
public class ErrorMessage {
    private int code;
    private String message;

    public ErrorMessage( String message,int code) {
        this.code = code;
        this.message = message;
    }
    
    
    
}

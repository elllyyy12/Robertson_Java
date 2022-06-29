import java.util.*;

/**
 * Java Course 2, Module 2
 * 
 * Hands-on Assignment 2: Object-Oriented Programming Advanced
   *
 * @author Elly Jay C. Gran
 */

public class IpAddressDriver {

    public static void main(String[] args) {

        IpAddress ip = new IpAddress("216.27.6.136");

        System.out.println(ip.getDottedDecimal());
        System.out.println(ip.getOctet(4));
        System.out.println(ip.getOctet(1));
        System.out.println(ip.getOctet(3));
        System.out.println(ip.getOctet(2));
    }

    //This is my IpAddress driver that was given in the instruction. I didn't modify anything I just followed
}

package Bakery;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class BakeryDriver
{
    static void main(String[] args)
    {
        Cookie cookie = new Cookie("Triple Chocolate", 2);

        System.out.println(cookie.getDepartment());
        System.out.println(cookie.getItemName());
        System.out.println(cookie.getType());
        System.out.println(cookie.getPrice());
        cookie.setPrice(3.5);
        System.out.println(cookie.getPrice());
    }
}

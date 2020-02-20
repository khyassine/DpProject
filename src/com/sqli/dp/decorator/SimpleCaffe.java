/**
 * 
 */
package com.sqli.dp.decorator;

/**
 * @author ehettifouri
 * 
 */
public class SimpleCaffe implements Coffee {

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.decorator.Coffee#calculeCout()
     */
    @Override
    public int calculeCout() {

        return 10;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sqli.dp.decorator.Coffee#getIngeriend()
     */
    @Override
    public String getIngeriend() {
        return "caffe, eau";
    }

}

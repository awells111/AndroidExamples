#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests written by codewars. These will only be run AFTER I have solved the problem and after I have created my own tests.
 *  */
public class StockTest {

#set( $raw_methods = ${CW_Test_Methods} )
#set( $replaced_class_name = $raw_methods.replace("Kata", "Solution") )
${replaced_class_name}
}

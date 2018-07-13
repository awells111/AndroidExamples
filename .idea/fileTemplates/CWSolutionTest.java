#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests written by https://github.com/awells111. I am writing these BEFORE I write my solution in order to practice Test Driven Development.
 *  */
public class SolutionTest {

#set( $raw_methods = ${CW_Test_Methods} )
#set( $replaced_class_name = $raw_methods.replace("Kata", "Solution") )
${replaced_class_name}
}

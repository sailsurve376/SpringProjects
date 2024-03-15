package org.jsp.spring_ioc_annotation_no_xml_hibernate.dto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jsp.spring_ioc_annotation_no_xml_hibernate.dto,org.jsp.spring_ioc_annotation_no_xml_hibernate.dao")
public class MyConfig {

}

package com.czf.boot.model.yaml;

import com.czf.boot.config.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;


@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"},factory= MixPropertySourceFactory.class)
//PropertySource(value = {"classpath:family.properties"})
public class Family {

   // @Value("${family.family-name}")
    @NotEmpty
    private String FamilyName;

    private Father father;
    private Mother mother;
    private Child child;
}

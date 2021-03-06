/* Licensed under Apache-2.0 */
package io.terrible.app;

import io.terrible.app.properties.SearchProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@Slf4j
@EnableCaching
@EnableConfigurationProperties(SearchProperties.class)
@SpringBootApplication
public class Application {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

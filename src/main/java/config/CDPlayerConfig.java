package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.PackageMarker;

@Configuration
@ComponentScan(basePackageClasses = PackageMarker.class)
public class CDPlayerConfig {
}

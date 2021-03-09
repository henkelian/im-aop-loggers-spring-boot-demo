package im.aop.loggers.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import im.aop.loggers.demo.bar.Bar;
import im.aop.loggers.demo.bar.BarService;
import im.aop.loggers.demo.baz.Baz;
import im.aop.loggers.demo.baz.BazService;
import im.aop.loggers.demo.foo.Foo;
import im.aop.loggers.demo.foo.FooService;
import im.aop.loggers.demo.qux.Qux;
import im.aop.loggers.demo.qux.QuxService;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Autowired private FooService fooService;

  @Autowired private BarService barService;

  @Autowired private BazService bazService;

  @Autowired private QuxService quxService;

  @Scheduled(initialDelay = 1000, fixedDelay = 15000)
  void runDemo() {
    fooService.accept(new Foo("abc"));

    barService.accept(new Bar("abc"));

    try {
      bazService.accept(new Baz("abc"));

    } catch (Exception e) {
    }

    quxService.accept(new Qux("abc"));
  }
}

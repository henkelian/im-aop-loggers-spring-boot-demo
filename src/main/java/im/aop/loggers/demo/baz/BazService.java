package im.aop.loggers.demo.baz;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.after.throwing.LogAfterThrowing;

@Service
public class BazService {

  @LogAfterThrowing
  public Baz accept(Baz baz) {
    throw new IllegalArgumentException("Baz");
  }
}

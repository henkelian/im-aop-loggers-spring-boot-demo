package im.aop.loggers.demo.qux;

import org.springframework.stereotype.Service;

import im.aop.loggers.advice.around.LogAround;

@Service
public class QuxService {

  @LogAround
  public Qux accept(Qux qux) {
    return qux;
  }
}

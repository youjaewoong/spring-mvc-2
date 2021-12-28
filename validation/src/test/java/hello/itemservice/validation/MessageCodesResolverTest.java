package hello.itemservice.validation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

public class MessageCodesResolverTest {

  MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();
  
  @Test
  void messageCodesResolverObject() {
      String[] messageCodes = codesResolver.resolveMessageCodes("required", "item");
      assertThat(messageCodes).containsExactly("required.item", "required");
  }
  
  @Test
  void messageCodesResolverField() {
      String[] messageCodes = codesResolver.resolveMessageCodes("required", "item", "itemName", String.class);
      assertThat(messageCodes).containsExactly(
              "required.item.itemName",
              "required.itemName",
              "required.java.lang.String",
              "required"
      );
  }
  
}
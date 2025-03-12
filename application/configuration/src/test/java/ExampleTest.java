import com.googlecode.yatspec.junit.SpecRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpecRunner.class)
public class ExampleTest {
    @Test
    public void reallySimpleExample() throws Exception {
        assertThat("The quick brown fox".contains("fox")).isTrue();
    }
}

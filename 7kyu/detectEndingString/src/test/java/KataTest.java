import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class KataTest {

    @ParameterizedTest
    @MethodSource("stringsAndEndingsProvider")
    void shouldDetectIfFirstStringsEndsWithGivenString(String sentence, String ending, boolean sentenceEndsWithEnding) {

        boolean endingIsAtTheEnd = Kata.solution(sentence, ending);

        assertThat(endingIsAtTheEnd).isEqualTo(sentenceEndsWithEnding);
    }

    public static Stream<Arguments> stringsAndEndingsProvider() {
        return Stream.of(
                Arguments.of("abc", "abc", true),
                Arguments.of("abc", "bc", true),
                Arguments.of("abc", "d", false));
    }
}

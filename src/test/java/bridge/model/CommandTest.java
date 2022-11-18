package bridge.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @ParameterizedTest
    @DisplayName("소문자가 입력된 경우")
    @ValueSource(strings = {"r", "q", "r", "q"})
    void isLowerCase(String input) {
        assertThatThrownBy(() -> Command.isReplay(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("R, Q가 아닌 다른 문자")
    @ValueSource(strings = {"Z", "B", "S", "T"})
    void isIncorrectData(String input) {
        assertThatThrownBy(() -> Command.isReplay(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("정확한 값이 들어오는지 여부 확인 1")
    @Test
    void isCorrectDataCase1() {
        //given
        String input = "R";
        //when
        //then
        assertTrue(Command.isReplay(input));
    }

    @DisplayName("정확한 값이 들어오는지 여부 확인 2")
    @Test
    void isCorrectDataCase2() {
        //given
        String input = "Q";
        //when
        //then
        assertFalse(Command.isReplay(input));
    }

}
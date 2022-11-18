package bridge.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BridgeSizeTest {
    @ParameterizedTest
    @DisplayName("문자열이 입력된 경우")
    @ValueSource(strings = {"21a", "13a", "24a", "a21"})
    void convertStringToIntException(String input) {
        assertThatThrownBy(() -> new BridgeSize(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("3 미만 20 초과한 데이터 값")
    @ValueSource(strings = {"21", "1", "38", "2"})
    void incorrectData(String input) {
        assertThatThrownBy(() -> new BridgeSize(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("정확한 값이 들어오는지 여부 확인 1")
    @Test
    void isCorrectDataCase1() {
        //given
        String input = "20";
        //when
        //then
        assertEquals(new BridgeSize(input).getBridgeSize(), 20);
    }
}
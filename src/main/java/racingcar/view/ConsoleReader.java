package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.global.exception.CustomException;
import racingcar.global.exception.ErrorMessage;

public final class ConsoleReader {
    public static String enterMessage() {
        return Validator.validate(Console.readLine());
    }

    private static class Validator {
        public static String validate(String message) {
            validateBlankInput(message);
            return message;
        }

        private static void validateBlankInput(String message) {
            if (message.isBlank()) {
                throw CustomException.from(ErrorMessage.BLANK_INPUT_ERROR);
            }
        }
    }
}
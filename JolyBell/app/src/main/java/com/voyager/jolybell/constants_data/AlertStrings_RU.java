package com.voyager.jolybell.constants_data;

import com.voyager.jolybell.model.AlertBody;

import java.util.ArrayList;
import java.util.List;

public class AlertStrings_RU implements AlertBody {
        @Override
        public String getSizechart_text() {
                return "Как правильно выбрать размер\n" +
                        "\n" +
                        "Выбираете вашу футболку/свитшот/худи и замеряете метром\n" +
                        "\n" +
                        "Ширина на размерной сетке указана буквой А, меряете под подмышками, от шва до шва, как показано красной линией.\n" +
                        "\n" +
                        "Длина на размерной сетке указана буквой B, меряете от горловины и до самого низа вещи, как показано красной линией.\n" +
                        "\n" +
                        "Длина рукава на размерной сетке указана буквой С, если это свитшот или худи, меряете от горловины и до самого конца рукава, если футболка, то как показано красной линией.\n" +
                        "\n" +
                        "Далее сравниваете ваши показатели с нашей таблицей размеров, прикинув плюс/минус пару сантиметров и выбираете размер.";
        }

        @Override
        public ArrayList<String> getRecomendation() {
                ArrayList<String> result = new ArrayList();
                result.add("Стандартные правила ухода:");
                result.add("Стирать в вывернутом состоянии, только в стиральной машине, деликатный режим, до 40 градусов, не выше 600 об/мин, не использовать машинную сушку, сушить только на вешалке, без попадания солнечных лучей на ткань. Принт утюгом не гладить.");
                return result;
        }
}

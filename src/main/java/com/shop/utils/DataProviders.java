package com.shop.utils;

import com.shop.models.UnregisteredUser;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> loginDataProvider() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File("src/test/resources/UserData.csv")));
        String line = br.readLine();
        while (line != null) {
            String[] split = line.split(",");

            list.add(new Object[]{new UnregisteredUser().setFirstName(split[0]).setLastName(split[1])
                    .setEmail(split[2]).setPassword(split[3]).setConfirmPassword(split[4])});
            line = br.readLine();
        }
        return list.iterator();

    }
}

package HomeTask_3;
// Ivanov Ivan Ivanovich 01.02.1990 89007896767
// Ivanov Sergei Ivanovich 01.01.1990 +79033334455
// Petrov Petr Petrovich 01.03.1991 89056661122
// Sergeev Sergei Sergeevich 32.12.1995 89012223344
// Mikhailov Mikhail Mikhailovich 31.13.1992 89045556677
// Nikolaev Nikolai Nikolaevich 01.01.1989 +7988777889
public class Main {
    public static void main(String[] args) {
        InputData data = new InputData();
        String [] dataArr = ParseData.ParseData(data.toString());
        WriteDataInFile.WriteDataInFile(dataArr);
    }
}

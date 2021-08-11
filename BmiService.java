public class BmiService {
    /* Создаём метод calculate, который принимает вес и рост,
    производит рассчёт и возвращает индекс массы тела.
     */
    public int calculate (int weight, int height) {
        int body_mass_index = weight / (height * height);
        return body_mass_index;
    }
}
package ru.netology;
class CallbackTest {
    private WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }
    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }
    @Test
    void shouldTestSomething() {
        throw new UnsupportedOperationException();
    }
}

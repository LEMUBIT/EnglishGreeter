module EnglishGreeter {
    requires Greeter.api;
    provides com.example.greeterapi.Greeter with com.example.englishgreeter.EnglishGreeter;
}
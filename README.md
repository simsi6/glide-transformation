Now developing...

[Report an issue](https://github.com/simsi6/glide-transformation/issues)


Supported transformations
=

* CircleTransformation

How do i use it?
=
```Java
private ImageView circle;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    circle = (ImageView)findViewById(R.id.circle);

    // CircleTransformation
    Glide.with(this)
            .load(R.drawable.korea)
            .override(100, 100)
            .bitmapTransform(new CircleTransformation(this))
            .into(circle);
}
```


Download
=

Gradle:
```gradle
repositories {
   jcenter();
}

dependencies {
  compile 'com.jaeryong:glide-transformation:0.0.1'
}
```

Maven:
```xml
<dependency>
  <groupId>com.jaeryong</groupId>
  <artifactId>glide-transformation</artifactId>
  <version>0.0.1</version>
  <type>pom</type>
</dependency>
```

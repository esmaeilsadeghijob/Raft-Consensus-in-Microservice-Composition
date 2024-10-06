# Raft consensus in microservice composition

## Software installation requirements
    ●  Install java v19
    ●  Install maven
    ●  Sqlite database
    ●  Postman
    ●  Apache JMeter
    ●  Consul

○ [Consul Documentation](https://developer.hashicorp.com/consul)

### Dataset
[Pitchfork Reviews Dataset](https://www.kaggle.com/nolanbconaway/pitchfork-data/data)

- database.sqlite

| Table    | Total Rows | Total Columns |
|----------|------------|---------------|
| artists  | 18831      | 2             |
| content  | 18393      | 2             |
| genres   | 22680      | 2             |
| labels   | 20190      | 2             |
| years    | 19108      | 2             |
| reviews  | 18393      | 13            |


____
<details>
<summary>Microservice's</summary>

    ●  YearsService
    ●  ReviewsService
    ●  LabelsService
    ●  GenresService
    ●  ContentService
    ●  ArtistsService

```
   puts "YearsMicroservice"
```
</details>
____


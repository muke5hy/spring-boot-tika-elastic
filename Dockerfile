FROM docker.elastic.co/elasticsearch/elasticsearch:7.1.1

RUN plugin install ingest-attachment


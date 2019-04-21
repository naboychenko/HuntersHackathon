npm run build
cp -r ./build ./docker
docker image build -t hunters/frontend ./docker
rm -r ./docker/build
